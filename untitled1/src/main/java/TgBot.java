import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TgBot extends TelegramLongPollingBot{

    @Override
    public void onUpdateReceived(Update update) {
System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());
        String Cd=update.getMessage().getText();
        if(Cd.equals("hello")){

        }
            String message="Hello,Tellegrambot";
        SendMessage send=new SendMessage();
        send.setChatId(update.getMessage().getChatId().toString());
        send.setText(message);
        try{
            execute(send);

        }
        catch( TelegramApiException Eg)
        {
            Eg.printStackTrace();


        }


    }
    @Override
    public String getBotUsername(){
        return"betsi15Bot";
    }
    @Override
    public String getBotToken(){
        return "5805820046:AAGUg42gLfiCqgH3yiTGPP7nf86mR_al5SY";

    }

}
