package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public abstract class d<ResultT> {
    static {
        Covode.recordClassIndex(32966);
    }

    public abstract d<ResultT> a(a aVar);

    public abstract d<ResultT> a(b<? super ResultT> bVar);

    public abstract d<ResultT> a(Executor executor, a aVar);

    public abstract d<ResultT> a(Executor executor, b<? super ResultT> bVar);

    public abstract boolean a();

    public abstract boolean b();

    public abstract ResultT c();

    public abstract Exception d();
}
