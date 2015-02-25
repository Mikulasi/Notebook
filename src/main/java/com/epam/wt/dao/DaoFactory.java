package com.epam.wt.dao;

import com.epam.wt.dao.daoMemoryImpl.NotebookDaoDBImpl;
import com.epam.wt.dao.daoMemoryImpl.NotebookDaoFileImpl;
import com.epam.wt.dao.daoMemoryImpl.NotebookDaoImpl;

import java.util.ResourceBundle;

public final class DaoFactory {

    private static NotebookDao notebookDao = new NotebookDaoImpl();
    private static NotebookDao notebookFileDao = new NotebookDaoFileImpl();
    private static NotebookDao notebookDBDao = new NotebookDaoDBImpl();

    private static String type="memory";

    static{
        ResourceBundle resourceBundle = ResourceBundle.getBundle(type);
        resourceBundle.
    }

    private DaoFactory() {
    }

    public static NotebookDao getDao(DestinationTypeEnum enumType){

        switch (enumType){
            case MEMORY: return notebookDao;
            case FILE: return notebookFileDao;
            case DATABASE: return notebookDBDao;
        }
        //return ;
    }
}
