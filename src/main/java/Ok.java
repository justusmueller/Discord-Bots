import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Ok extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
    	JDA jda = new JDABuilder("NjMzNDA3OTMyNzk2NjMzMTE5.XaThPA.7kptewZzLOHohnayX-5TonJpc7M").addEventListeners(new Ok()).build();	    	
    }
    
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String msg = event.getMessage().getContentRaw();
        if (!event.getMember().getUser().isBot()&&msg.equals("!affe"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage(event.getMember().getAsMention() + "Du bist ein Affe. :gorilla:").queue();
        }
    }
}
