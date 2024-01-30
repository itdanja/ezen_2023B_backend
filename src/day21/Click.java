package day21;

public class Click implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println(" [구현 객체를 이용한] OK버튼을 클릭했습니다.");
    }
}
