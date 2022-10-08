//package br.com.backendemployees.handler;
//
//import br.com.backendemployees.exception.ErrorMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import java.util.Date;
//
//@ControllerAdvice //Fica verificando os controladores para, receber e validar as requisições.
//public class EmployeesExceptionHandler extends ResponseEntityExceptionHandler {
//    @Autowired
//    private MessageSource messageSource;
//
//    @ExceptionHandler(value = {Exception.class})
//    public ResponseEntity<Object> handleExceptions(Exception exception,
//                                                  WebRequest request) {
//        String errorDescription = exception.getLocalizedMessage();
////        if(errorDescription==null) errorDescription = exception.toString();
//        ErrorMessage errorMessage = new ErrorMessage(new Date(), errorDescription);
////        List<Erro> erros = createErrorList(exception.getBindingResult());
//        return new ResponseEntity<>(exception, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }//Recebe os argumentos que não conseguimos validar e trata todas essas exceções
////
////    private List<Erro> createErrorList(BindingResult bindingResult){
////        List<Erro> erros = new ArrayList<>();
////        for(FieldError fieldError: bindingResult.getFieldErrors()){
////            String userMessage = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
////            String developerMessage = fieldError.toString();
////            erros.add(new Erro(userMessage, developerMessage));
////        }
////        return erros;
////    }
////    @Getter
////    public class Erro{
////        String userMessage;
////        String developerMessage;
////
////        public Erro(String userMessage, String developerMessage){
////            this.userMessage=userMessage;
////            this.developerMessage=developerMessage;
////        }
////    }
//}
