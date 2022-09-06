package lotto;

public class Output {


    ㅔㅕ

    public String printLottoResult(int matchNum, int count){
        switch(matchNum) {
            case 3: System.out.print("3개 일치 (5000원)-");
            case 4: System.out.print("4개 일치 (50000원)-");
            case 5: System.out.print("5개 일치 (1500000원)-");
            case 6: System.out.print("6개 일치 (2000000000원)-");
        }
        System.out.println(count+"개");
    }
    public float ProfitRate(int input, int revenue){
        return (revenue-input)/input*100;
    }

    public String printProfitRate(float profitRate){
        System.out.println("총 수익률은 "+ profitRate +"%입니다.");
    }
}
