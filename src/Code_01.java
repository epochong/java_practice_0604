import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author wangchong
 * @date 2019/6/4 17:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        Scanner in = new Scanner(input.nextLine());
        List<Integer> list = new ArrayList <>();
        int index = 0;
        while (in.hasNextInt()) {
            arr[index++] += in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            while (arr[i]-- > 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        list.add(0,list.remove(list.lastIndexOf(0) + 1));
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.print(i));
    }
}
