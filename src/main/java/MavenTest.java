public class MavenTest {

    public static void main(String[] args) {



    }

    public static int alarmStufe(String alarmFarbe) {

        if (alarmFarbe == "grün") {

            return 60;

        } else if (alarmFarbe == "gelb") {

            return 30;

        } else if (alarmFarbe == "rot"){
            return 0;
        }
        return -23;
    }


}

