package simple.example.motorpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.motorpedia.model.Airterjun;
import simple.example.motorpedia.model.Bukit;
import simple.example.motorpedia.model.Hewan;
import simple.example.motorpedia.model.Pantai;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Pantai> initDataAyam(Context ctx) {
        List<Pantai>pantais = new ArrayList<>();
        pantais.add(new Pantai("Pantai pink", "Lombok Selatan",
                "Hamparan pantai berpasir pink yang indah dengan perpaduan pepohonan hijau yang mepesona  ", R.drawable.pantaipink));
        pantais.add(new Pantai("Pantai kura-kura", "Ekas Jerowaru",
                "Pantai yang iconic dengan batu mirip kura-kura masih sangat asli", R.drawable.pantaikurakura));
        pantais.add(new Pantai("pantaipenyisok", "Jerowaru",
                "Pantai dengan tebing tinggi dengan ombak besar yang mempesona", R.drawable.pantaipenyisok));
        pantais.add(new Pantai("Pantai Semeti", "Lombok Tengah",
                "Pantai yang khas dengan bebatuan yang iconik", R.drawable.pantaisemeti));

        return pantais;
    }

    private static List<Airterjun> initDataPuyuh(Context ctx) {
        List<Airterjun>airterjuns= new ArrayList<>();
        airterjuns.add(new Airterjun("Skeper Waterfall", "Santong, Lombok Timur",
                "Merupakan air terjun tertinggi di lombok.", R.drawable.skeper));
        airterjuns.add(new Airterjun("Benang Kelambu Waterfall", "Batu Kliang, Lombok Tengah ",
                " Air terjun ini mirip seperti gorden yang dalam bahasa sasak disebut kelambu", R.drawable.benangkelambu));
        airterjuns.add(new Airterjun("Tiu Kelep Waterfall", "Senaru, Lombok Utara",
                "Air terjun yang berada di bawah kaki gunung rinjani inii menawarkan ke indahan alam yang masih asri", R.drawable.tiukelep));
        airterjuns.add(new Airterjun("Jeruk Manis Waterfall", "Tete Batu",
                "Air terjun yang berada di tengah hutan menawarkan pemandangan yang masih sangat asri dan sejuk.", R.drawable.pantaipenyisok));

        return airterjuns;
    }

    private static List<Bukit> initDataItik(Context ctx) {
        List<Bukit>bukits= new ArrayList<>();
        bukits.add(new Bukit("Bukit Nanggi","Sembalun Lawang",
                "Bukit yang sudah lama menjadi primadona dengan hamparan rumput hijau yang mempesona", R.drawable.nanggi));
        bukits.add(new Bukit("Bukit Pall Jepang", "Sapit Suela, Lombok Timur",
                "Bukit yang berada seperti negeri di atas awan", R.drawable.palljepang));
        bukits.add(new Bukit("Bukit Anak Dara", "Sembalun, Lombok Timur",
                "Bukit yang berada di tengah-tengah Desa sembalun ", R.drawable.anakdara));
        bukits.add(new Bukit("Pantai Sempana", "Sembalun, Lombok Timur",
                "Bukit yang cukup tinggi dan termasuk dalam seven summit sembalun", R.drawable.sempana));
        return bukits;
    }

    private static void initAllMotors(Context ctx) {
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataPuyuh(ctx));
        hewans.addAll(initDataItik(ctx));
    }

    public static List<Hewan> getAllMotor(Context ctx) {
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getMotorsByTipe(Context ctx, String merek) {
        List<Hewan> motorsByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
