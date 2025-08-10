package KataTest.JavaCore1.Stringeses;

public class HardCore {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder rolTex = new StringBuilder();
        for (String a:roles){
            String as = new String(a);
            rolTex.append(a);
            for (int i =0; i<textLines.length; i++){
                if(textLines[i].startsWith(as)){
                    rolTex.append(textLines[i].substring(as.length() + 1).trim());
                    rolTex.insert(as.length(), ": ");
                }
            }
        }
        String fine = new String(rolTex);
return fine;

        }
    public static void main(String[] args) {
        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                ,"Аммос Федорович: Как ревизор?"
                ,"Артемий Филиппович: Как ревизор?"
                ,"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                ,"Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles,textLines));
    }
    }



    class HardsCore {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            int lineNumber = 1;

            for (String line : textLines) {
                if (line.startsWith(role + ": ")) {
                    result.append(lineNumber).append(") ")
                            .append(line.substring(role.length()+2))
                            .append("\n");
                }
                lineNumber++;
            }

            result.append("\n"); // Добавляем пустую строку между ролями
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, textLines));
    }
}