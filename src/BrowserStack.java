import java.util.Stack;

public class BrowserStack {
    private Stack<String> history = new Stack<>();

    // 페이지 방문 시 (스택저장)
    public void visit(String url){
        history.push(url);
        System.out.println("방문한곳: " + url);
    }

    // 뒤로 가기 (pop 사용)
    public void back() {
        if(!history.isEmpty()){
            String previousPage = history.pop();
            System.out.println("뒤로가기실행: " + previousPage);
        } else {
            System.out.println("뒤로 갈 수 있는 페이지가 없습니다.");
        }
    }
}