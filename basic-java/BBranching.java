public class BBranching {
    public static void main(String[] args) {
        String userAccess = "user";
        String token = "";
        if (userAccess.equals("admin")) {
        System.out.println("halo admin");
        }else{
        System.out.println("halo orang lain");
        }

        // if (userAccess.equals("admin")) {
        // token = "token admin";
        // }else if(userAccess.equals("user")){
        // token = "token user";
        // }else{
        // token = "default";
        // }

        // System.out.println(token);

        switch (userAccess) {
            case "admin":
                token = "token admin";
                break;
            case "user":
                token = "token user";
                break;
            default:
                token = "default";
                break;
        }
        System.out.println(token);

        // ternary
        int umur1 = 20;
        String hasilUmur = (umur1 < 17) ? "remaja" : "dewasa";
        System.out.println(hasilUmur);
    }

}
