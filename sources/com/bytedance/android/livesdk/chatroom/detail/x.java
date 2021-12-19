package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.d.b;
import com.bytedance.android.d.c;
import com.bytedance.android.d.e;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.view.d;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class x implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15323a = x.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static volatile x f15324d;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f15325b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Queue<c> f15326c = new LinkedList();

    static {
        Covode.recordClassIndex(8468);
    }

    public static boolean b() {
        Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
        if (valueOf == null || valueOf.booleanValue()) {
            return false;
        }
        return true;
    }

    public static x a() {
        MethodCollector.i(236);
        if (f15324d == null) {
            synchronized (x.class) {
                try {
                    if (f15324d == null) {
                        f15324d = new x();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(236);
                    throw th;
                }
            }
        }
        x xVar = f15324d;
        MethodCollector.o(236);
        return xVar;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.android.d.e
    public final c b(String str) {
        if (this.f15325b.containsKey(str)) {
            return this.f15325b.get(str);
        }
        return null;
    }

    @Override // com.bytedance.android.d.e
    public final void b(c cVar) {
        Iterator<Map.Entry<String, c>> it = this.f15325b.entrySet().iterator();
        while (it.hasNext()) {
            c value = it.next().getValue();
            if (value == null || cVar == null || !TextUtils.equals(value.getPlayerTag(), cVar.getPlayerTag())) {
                value.stop(true);
                value.release();
                it.remove();
            }
        }
    }

    public final c a(String str) {
        return this.f15325b.get(str);
    }

    public final void a(c cVar) {
        String playerTag = cVar.getPlayerTag();
        if (playerTag != null) {
            cVar.release();
            this.f15325b.remove(playerTag);
            this.f15326c.offer(cVar);
        }
    }

    private static boolean a(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        if (!m.a(str) || !m.a(str2)) {
            return true;
        }
        return false;
    }

    public static void a(c cVar, Context context, d dVar, b.a aVar) {
        if (cVar != null) {
            cVar.attach(context, dVar, aVar);
        }
    }

    public final c a(long j2, Context context, String str, String str2, String str3, String str4, s.a aVar, i iVar) {
        c poll;
        c.a a2 = c.a.a(a(context)).a(str3);
        a2.f6847c = str4;
        c.a b2 = a2.b(str);
        b2.f6849e = str2;
        b2.f6850f = iVar;
        b2.f6851g = aVar;
        if (!this.f15326c.isEmpty() && (poll = this.f15326c.poll()) != null) {
            poll.initialize(j2, b2);
        } else {
            poll = new RoomPlayer2(j2, b2);
        }
        this.f15325b.put(poll.getPlayerTag(), poll);
        com.bytedance.android.livesdk.chatroom.g.d.a(f15323a, "createRoomPlayer -> playerTag: " + poll.getPlayerTag());
        return poll;
    }

    public final c a(long j2, Context context, String str, String str2, String str3, String str4, s.a aVar, i iVar, boolean z, String str5, String str6) {
        if (!a(context, str, str3)) {
            return null;
        }
        c a2 = a(j2, context, str, str2, str3, str4, aVar, iVar);
        a2.setReusePlayer(z, str5);
        a2.setEnterRoomScene(str6);
        a2.warmUp();
        return a2;
    }
}
