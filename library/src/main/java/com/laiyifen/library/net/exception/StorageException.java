package com.laiyifen.library.net.exception;

/**
 * Created by wisn on 2017/8/22.
 */

public class StorageException extends Exception {

    private static final long serialVersionUID = 178946465L;

    public StorageException() {
    }

    public StorageException(String detailMessage) {
        super(detailMessage);
    }

    public StorageException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public StorageException(Throwable throwable) {
        super(throwable);
    }

    public static StorageException NOT_AVAILABLE() {
        return new StorageException("SDCard isn't available, please check SD card and permission: WRITE_EXTERNAL_STORAGE, and you must pay attention to Android6.0 RunTime Permissions!");
    }
}
