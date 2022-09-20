package textmusicconverter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class MusicAssembler {

    private static final Player player = new Player();
    
    public static void playAudio() {
        //System.out.println(generateAudioString());
        player.play(generateAudioString());
    }
    
    
    public static int generateAudioFile(Path urlMIDISelected) {
         
        File outputFile = new File(urlMIDISelected + ".mid");
        Pattern pattern = new Pattern();
        pattern.add(generateAudioString());
        try{
            MidiFileManager.savePatternToMidi(pattern, outputFile);
        } catch(IOException error){
            return -1;
            //JOptionPane.showMessageDialog(rootPane, "Erro ao salvar arquivo.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }return 0;
    } 
    
    
    public static String generateAudioString() {
        StringBuilder builder = new StringBuilder();

        for (String word : SoundHandler.getAudioScript()) {
            builder.append(word);
            builder.append(" ");
        }

        return builder.toString();
    }
}
