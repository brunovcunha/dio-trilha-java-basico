public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        
        String objetoEscolhido = "msn";

        switch (objetoEscolhido) {
            case "tlg":
                smi = new TelegramMessenger();
                break;

                case "msn":
                smi = new MSNmessenger();
                break;
                
                case "fcb":
                smi = new FacebookMessenger();
                break;
        
            default:
                break;
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
