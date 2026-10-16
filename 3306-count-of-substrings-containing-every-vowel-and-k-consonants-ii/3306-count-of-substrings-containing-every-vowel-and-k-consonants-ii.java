class Solution {
    public long countOfSubstrings(String word, int k) {
        return atMost(word, k) - atMost(word, k - 1);
    }

    private long atMost(String word, int k) {
        if (k < 0) return 0;

        int n = word.length();
        int left = 0;
        int consonants = 0;
        long count = 0;

        int[] lastSeen = {-1, -1, -1, -1, -1};

        for (int right = 0; right < n; right++) {
            char ch = word.charAt(right);
            int vowel = getVowelIndex(ch);

            if (vowel != -1) {
                lastSeen[vowel] = right;
            } else {
                consonants++;
            }

            while (consonants > k) {
                char leftChar = word.charAt(left);

                if (getVowelIndex(leftChar) == -1) {
                    consonants--;
                }

                left++;
            }

            int minLastSeen = Integer.MAX_VALUE;

            for (int pos : lastSeen) {
                minLastSeen = Math.min(minLastSeen, pos);
            }

            if (minLastSeen >= left) {
                count += minLastSeen - left + 1;
            }
        }

        return count;
    }

    private int getVowelIndex(char ch) {
        switch (ch) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default: return -1;
        }
    }
}