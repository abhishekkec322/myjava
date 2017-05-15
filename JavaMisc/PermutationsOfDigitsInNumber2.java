package codiality;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfDigitsInNumber2
{
        private int[] key;
        private String word, pWord;
        private int n, i = 1;
 
        public PermutationsOfDigitsInNumber2(String word)
        {
                this.word = word;
 
                n = word.length();
                key = new int[n + 1];
 
                for (int i = 1; i <= n; i++)
                 key[i] = i;
        }
 
        public boolean next()
        {
                if (i == 1)
                {
                        build();
                }
                else if (i == fact(n) + 1)
                {
                        return false;
                }
                else if (i % 2 == 0)
                {
                        swap(n, n - 1);
                        build();
                }
                else if (i % 2 == 1)
                {
                        int j, k;
 
                        for (j = n - 1; j >= 0; j--)
                        {
                                if ((i - 1) % fact(j) == 0)
                                {
                                        add(n - j);
                                        for (k = 1; k <= n - j - 1; k++)
                                        {
                                                if (key[k] == key[n - j])
                                                {
                                                        add(n - j);
                                                        k = 0;
                                                }
                                        }
                                }
                        }
 
                        build();
                }
 
                i++;
                return true;
        }
 
        private long fact(long f) { return f == 0 ? 1: f * fact(f - 1); }
 
        private void swap(int a, int b)
        {
                int t = key[a];
                key[a] = key[b];
                key[b] = t;
        }
 
        private void build()
        {
                StringBuilder s = new StringBuilder();
 
                for(int i = 1; i <= n; i++)
                 s.append(word.charAt(key[i] - 1));
 
                pWord = s.toString();
        }
 
        private void add(int i)
        {
                key[i]++;
                if (key[i] == n + 1)
                 key[i] = 1;
        }
 
        public String nextWord()
        {
                return pWord;
        }
 
        public static void main(String[] args)
        {
        	PermutationsOfDigitsInNumber2 p = new PermutationsOfDigitsInNumber2(String.valueOf(101));
                int maxPossibleIntegers=0;
                
                Set<String> uniqueCombination = new HashSet<String>();
                
                while (p.next())
                {
                	if(p.nextWord().startsWith("0"))
                		break;
                	if(uniqueCombination.contains(p.nextWord()) )
                		break;
                	uniqueCombination.add(p.nextWord());
                	
                    System.out.printf("I am printing %s %n",p.nextWord());
                	maxPossibleIntegers++;
                }
                System.out.printf("I am printing %s",maxPossibleIntegers);
        }
}