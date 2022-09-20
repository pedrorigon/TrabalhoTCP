package textmusicconverter;

public class InputParser {

    private static String userInput;
    public final static char newLine = (char) 0x0A;

    public static String getUserInput() {
        return userInput;
    }

    public static void setUserInput(String userInput) {
        InputParser.userInput = userInput;
    }

    public static int getUserInputSize() {
        return userInput.length();
    }

    public static void checkPreviousChar(int auxCharIndex) {
        if (getUserInputSize() > 1) {
            if (getUserInput().charAt(auxCharIndex - 1) >= 'A' && getUserInput().charAt(auxCharIndex - 1) <= 'G') {
                ParserMethods.repeatPreviousNote();
            } else {
                ParserMethods.appendSilence();
            }
        } else {
            ParserMethods.appendSilence();
        }
    }

    public static void userInputParser() {

        SoundHandler.initialize();
        for (int charIndex = 0; charIndex < getUserInputSize(); charIndex++) {

            char c = getUserInput().charAt(charIndex);

            //check the chars of input
            switch (c) {
                case 'A':
                    ParserMethods.appendNoteA();
                    break;
                case 'B':
                    ParserMethods.appendNoteB();
                    break;
                case 'C':
                    ParserMethods.appendNoteC();
                    break;
                case 'D':
                    ParserMethods.appendNoteD();
                    break;
                case 'E':
                    ParserMethods.appendNoteE();
                    break;
                case 'F':
                    ParserMethods.appendNoteF();
                    break;
                case 'G':
                    ParserMethods.appendNoteG();
                    break;
                case ' ':
                    ParserMethods.doubleCurrentVol(); //ajustar 
                    break;
                case '!':
                    ParserMethods.doubleCurrentVol(); //ajustar 
                    break;
                case '?':
                    ParserMethods.octavePlus();
                    break;
                case '.':
                    ParserMethods.octavePlus();
                    break;
                case ';':
                    ParserMethods.octavePlus(); //
                    break;
                case ',':
                    ParserMethods.octavePlus();// 
                    break;
                case newLine:
                    ParserMethods.octavePlus(); ////
                    break;
                default:
                    if (c > '0' && c < '9') {
                        //instrumento
                    } else if (c == 'O' || c == 'o' || c == 'I' || c == 'i' || c == 'U' || c == 'u') {

                    } else {
                        checkPreviousChar(charIndex);
                    }
            }
        }
    }

}
