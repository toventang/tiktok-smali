package com.ss.android.ugc.aweme.sticker.types.lock;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.types.unlock.LockStickerTextBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<String> f136140a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f136141b = false;

    /* renamed from: c  reason: collision with root package name */
    private static List<LockStickerTextBean> f136142c = new ArrayList();

    static {
        Covode.recordClassIndex(88922);
    }

    public static ArrayList<String> a() {
        Iterator<String> it = f136140a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f136140a);
        arrayList.addAll(c.a().b());
        return arrayList;
    }
}
