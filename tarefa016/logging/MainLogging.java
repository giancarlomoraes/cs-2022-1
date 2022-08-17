package com.example.demo.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLogging {
    final static Logger logger = LogManager.getLogger(MainLogging.class);

    public static void main(String[] args) {

        //Método copiado do professor Gilmar

        MainLogging obj = new MainLogging();

        try{
            obj.divide();
        }catch(ArithmeticException ex){
            logger.error("Sorry, something wrong!", ex);
        }


    }

    private void divide(){

        int i = 10 / 0;

    }
}
