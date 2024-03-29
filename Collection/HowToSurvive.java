package Collection;

import java.util.ArrayList;

public class HowToSurvive {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        // Insert soldiers in an order they were originally at
        for (int soldierNumber = 1; soldierNumber <= n; soldierNumber++) {
            soldiers.add(soldierNumber);
        }

        int killIndex = 0;
        while (soldiers.size() > 1) {
            killIndex = (killIndex + k - 1) % soldiers.size();
            System.out.println(soldiers.remove(killIndex) + "번 군사가 죽습니다.");
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
