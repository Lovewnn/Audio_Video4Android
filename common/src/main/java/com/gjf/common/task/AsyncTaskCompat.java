package com.gjf.common.task;

import android.os.AsyncTask;

public final class AsyncTaskCompat {

    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> executeParallel(
            AsyncTask<Params, Progress, Result> task,
            Params... params) {
        if (task == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, params);
        return task;
    }
    private AsyncTaskCompat() {}
}
