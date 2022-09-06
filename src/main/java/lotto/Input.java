package lotto;

import java.util.*;

public class Input {

    public int inputPrice() {
        System.out.println("구입금액을 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public int inputLottoSize() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public ArrayList<ArrayList<Integer>> inputBuyNumbers() {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        return new ArrayList<ArrayList<Integer>>();
    }

}


