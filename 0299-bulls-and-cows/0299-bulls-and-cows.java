
class Solution {
    public String getHint(String secret, String guess) {

        int n = secret.length();

        int bulls = 0;
        int cow = 0;

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(secret.charAt(i));
        }
        for(int i = 0; i < n; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                list.remove(Character.valueOf(secret.charAt(i)));
            }
        }

        for(int i = 0; i < n; i++) {
            if(secret.charAt(i) != guess.charAt(i) &&
               list.contains(guess.charAt(i))) {

                cow++;
                list.remove(Character.valueOf(guess.charAt(i)));
            }
        }

        return bulls + "A" + cow + "B";
    }
}