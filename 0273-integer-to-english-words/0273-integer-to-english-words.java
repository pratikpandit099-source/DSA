class Solution {

    String[] ones = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        StringBuilder ans = new StringBuilder();

        if (num >= 1_000_000_000) {
            ans.append(convert(num / 1_000_000_000))
               .append(" Billion ");
            num %= 1_000_000_000;
        }

        if (num >= 1_000_000) {
            ans.append(convert(num / 1_000_000))
               .append(" Million ");
            num %= 1_000_000;
        }

        if (num >= 1000) {
            ans.append(convert(num / 1000))
               .append(" Thousand ");
            num %= 1000;
        }

        if (num > 0) {
            ans.append(convert(num));
        }

        return ans.toString().trim();
    }

    private String convert(int num) {

        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(ones[num / 100])
                  .append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[num / 10])
                  .append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(ones[num])
                  .append(" ");
        }

        return result.toString().trim();
    }
}