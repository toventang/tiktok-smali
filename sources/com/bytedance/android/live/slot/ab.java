package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ac;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;
import java.util.Map;

public interface ab<W, VM extends ac, T extends Enum<T>> {

    public interface a {
        static {
            Covode.recordClassIndex(7088);
        }

        Context a();

        boolean a(ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.b> abVar, IIconSlot.SlotViewModel slotViewModel);
    }

    public interface b {
        static {
            Covode.recordClassIndex(7089);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(7087);
    }

    List<Integer> a();

    void a(Bundle bundle);

    void a(VM vm, a aVar);

    void a(IMessage iMessage);

    void a(String str);

    void a(Map<String, Object> map, b bVar);

    void b();

    void c();

    void d();

    T e();

    W f();

    String g();
}
