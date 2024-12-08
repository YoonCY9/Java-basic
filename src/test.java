public class test {

    public static void main(String[] args) {
        

    }



    //    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> participantCount = new HashMap<>();
//        for (String count : participant) {
//            participantCount.put(count, participantCount.getOrDefault(count, 0) +1);
//        }
//        for (String minus : completion) {
//            if (participantCount.containsKey(minus)) {
//                participantCount.put(minus, participantCount.get(minus) - 1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry : participantCount.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            if (value == 1) {
//                answer = key;
//                break;
//            }
//        }
//        return answer;
//    }
    public static int[] solution(int[] num_list) {

        int count = 0; //짝
        int count2 = 0;  //홀
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0 || num_list[i] == 0) {
                count++;
            }
            if (num_list[i] % 2 == 1) {
                count2++;
            }
        }
        int[] answer = new int[2];
        answer[0] = count;
        answer[1] = count2;
        return answer;
    }

}
