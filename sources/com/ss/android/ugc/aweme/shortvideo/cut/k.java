package com.ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.tt.appbrandimpl.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f125467a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(82351);
    }

    public static void a(ArrayList<String> arrayList, StringBuilder sb) {
        l.d(sb, "");
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("#").append(it.next()).append(" ");
            }
        }
    }

    public static void a(t tVar, StringBuilder sb, List<AVTextExtraStruct> list) {
        b bVar;
        List<TaskMentionedUser> list2;
        l.d(sb, "");
        l.d(list, "");
        if (!(tVar == null || !(!TextUtils.isEmpty(tVar.getExtra())) || (bVar = (b) g.a().G().a(tVar.getExtra(), b.class)) == null)) {
            List<String> list3 = bVar.f155096a;
            if (list3 != null && (!list3.isEmpty())) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    sb.append("#").append((String) it.next()).append(" ");
                }
            }
            String str = bVar.f155097b;
            if (!(str == null || (list2 = bVar.f155100e) == null || !(!list2.isEmpty()))) {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    StringBuilder sb2 = new StringBuilder("@");
                    l.b(t, "");
                    arrayList.add(sb2.append(t.getNickname()).toString());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                Object[] copyOf = Arrays.copyOf(array, array.length);
                String a2 = a.a(str, Arrays.copyOf(copyOf, copyOf.length));
                l.b(a2, "");
                sb.append(a2);
                for (T t2 : list2) {
                    l.b(t2, "");
                    int indexOf = sb.indexOf(t2.getNickname()) - 1;
                    String userId = t2.getUserId();
                    l.b(userId, "");
                    list.add(AVTextExtraStructHelper.createAtStruct(indexOf, indexOf + 1 + t2.getNickname().length(), userId, t2.getSecUid()));
                }
            }
        }
    }
}
