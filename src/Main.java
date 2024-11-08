public class Main {
    public static void main(String[] args) {
        String loginUrl = "page1.com";
        String searchUrl = "page2.com";
        String logOutUrl = "page3.com";

        BrowserStack browser = new BrowserStack();
        // 순서대로 방문한다 가정 시
        browser.visit(loginUrl);
        browser.visit(searchUrl);
        browser.visit(logOutUrl);


        // 뒤로가기 버튼 클릭 시
        browser.back();
        browser.back();
        browser.back();

        // 모든 데이터 해제 시 출력 값
        browser.back();
    }
}
