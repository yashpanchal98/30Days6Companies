class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Integer> idxHs = new HashSet<>();
        int bulls = 0, cows = 0;
        int n = secret.length();

        for (int i = 0; i < n; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                idxHs.add(i);
            } else {
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (!idxHs.contains(i) && map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) > 0) {
                cows++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bulls).append("A").append(cows).append("B");
        return sb.toString();
    }
}
