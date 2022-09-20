package textmusicconverter;

public class ParserMethods {

    public static void appendNoteC() {
        SoundHandler.appendNote('C');
    }

    public static void appendNoteD() {
        SoundHandler.appendNote('D');
    }

    public static void appendNoteE() {
        SoundHandler.appendNote('E');
    }

    public static void appendNoteF() {
        SoundHandler.appendNote('F');
    }

    public static void appendNoteG() {
        SoundHandler.appendNote('G');
    }

    public static void appendNoteA() {
        SoundHandler.appendNote('A');
    }

    public static void appendNoteB() {
        SoundHandler.appendNote('B');
    }
    
    public static void appendSilence() {
        SoundHandler.appendNote('R');
    }
    
    public static void repeatPreviousNote(){
        SoundHandler.playPreviousNote();
    }

    public static void doubleCurrentVol() {
        SoundHandler.doubleVolume();
    }
    
    public static void octavePlus() {
        SoundHandler.increaseOctave();
    }

    public static void octaveMinus() {
        SoundHandler.decreaseOctave();
    }

    public static void questionMark() {
        SoundHandler.playRandomNote();
    }

    public static void newLine() {
        SoundHandler.switchInstrumentRandomly();
    }

}
