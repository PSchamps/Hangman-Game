import java.util.Scanner;
class hangman
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The 1st Player will enter the Movie/Show name");
        String str = sc.nextLine();
        str = str.toUpperCase();
        String s = str;
        s = s+" ";
        String word = "";
        String neword = "";
        System.out.println(" \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.print(ch+" ");
                neword = neword+ch;
            }
            else if(ch==' ')
            {
                System.out.print("/ ");
                neword = neword+"/";
            }
            else
            {
                System.out.print("_ ");
                neword = neword+"_";
            }
        }
        System.out.println();   
        System.out.println();
        System.out.println("Now the rest of the Players are going to guess it");
        int j = 1;
        int flag = 0;
        char arr[] = neword.toCharArray();
        while(j<=7)
        {
            System.out.println("Enter your letter to guess: ");
            char guess = sc.next().charAt(0);
            for(int i = 0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(guess==ch)
                {
                    arr[i] = ch;
                    flag = 1;
                }
            }
            System.out.println();
            if(flag==0)
            {
                j++;
                if(j==2)
                {
                    System.out.println("            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else if(j==3)
                {
                    System.out.println("            ______\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else if(j==4)
                {
                    System.out.println("            ______\n" +
                            "            |    |\n" +
                            "            |    O\n" +
                            "            |    |\n" +
                            "            |    |\n" +
                            "            |\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else if(j==5)
                {
                    System.out.println("            ______\n" +
                            "            |    |\n" +
                            "            |    O\n" +
                            "            |    |\n" +
                            "            |    |\n" +
                            "            |     \\\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else if(j==6)
                {
                    System.out.println("            ______\n" +
                            "            |    |\n" +
                            "            |    O\n" +
                            "            |    |\n" +
                            "            |    |\n" +
                            "            |   / \\\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else if(j==7)
                {
                    System.out.println("            ______\n" +
                            "            |    |\n" +
                            "            |    O\n" +
                            "            |    |\\\n" +
                            "            |    |\n" +
                            "            |   / \\\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println();
                    System.out.println();
                }
                else
                {
                    System.out.println("            ______\n" +
                            "            |    |\n" +
                            "            |    O\n" +
                            "            |   /|\\\n" +
                            "            |    |\n" +
                            "            |   / \\\n" +
                            "            |\n" +
                            "          -----");
                    System.out.println(str);
                            break;
                }
            }
            for(int i = 0;i<neword.length();i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println();
            flag = 0;
        }
    }
}