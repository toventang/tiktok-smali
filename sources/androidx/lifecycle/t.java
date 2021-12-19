package androidx.lifecycle;

import com.bytedance.covode.number.Covode;

public class t<T> extends LiveData<T> {
    static {
        Covode.recordClassIndex(1337);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t) {
        super.postValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
    }
}
