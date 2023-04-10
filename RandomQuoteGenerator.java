import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
            "The way to get started is to quit talking and begin doing. -Walt Disney",
            "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt",
            "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey",
            "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Success is not how high you have climbed, but how you make a positive difference to the world. - Roy T. Bennett",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful. - Albert Schweitzer",
            "The only place where success comes before work is in the dictionary. - Vidal Sassoon",
            "Success is stumbling from failure to failure with no loss of enthusiasm. - Winston Churchill",
            "Success is not about being the best. It’s about always getting better. - Behance",
            "The road to success and the road to failure are almost exactly the same. - Colin R. Davis",
            "Success is not how much money you have but how much you impact others positively. - Kid Cudi",
            "Success is not measured by what you accomplish, but by the opposition you have encountered, and the courage with which you have maintained the struggle against overwhelming odds. - Orison Swett Marden",
            "Success is the sum of small efforts repeated day in and day out. - Robert Collier",
            "Joy is the simplest form of gratitude. - Karl Barth",
            "Joy is not in things it is in us. - Richard Wagner",
            "The most wasted of all days is one without laughter. - E. E. Cummings",
            "Find ecstasy in life; the mere sense of living is joy enough. - Emily Dickinson",
            "Joy does not simply happen to us. We have to choose joy and keep choosing it every day. - Henri J. M. Nouwen",
            "Positive anything is better than negative nothing. - Elbert Hubbard",
            "Positive thinking will let you do everything better than negative thinking will. - Zig Ziglar",
            "You cannot have a positive life and a negative mind. - Joyce Meyer",
            "The positive thinker sees the invisible, feels the intangible, and achieves the impossible. - Winston Churchill",
            "Optimism is a happiness magnet. If you stay positive, good things and good people will be drawn to you. - Mary Lou Retton"
        };

        // Generate a random index
        Random random = new Random();
        int index = random.nextInt(quotes.length);

        // Print the quote
        System.out.println(quotes[index]);
    }
}
