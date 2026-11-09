public class Test {
    public static void main(String[] args) {
        String id = "user";
        String pw = "9999";
        
        if(id.equals("admin"))
        {
            String login = (pw.equals("1234") ? "로그인 성공" : "비밀번호가 틀렸습니다.");
            System.out.println(login);
        }else if(! id.equals("admin") && pw.equals("1234"))
        {
            System.out.println("아이디가 틀렸습니다.");
        }else
        {
            System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
        }
    }
}