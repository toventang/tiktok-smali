package com.ss.android.ugc.aweme.dsp.playerservice.d.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.j;
import com.ss.ttvideoengine.p;
import h.f.b.l;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1970a f83479a = new C1970a((byte) 0);

    static {
        Covode.recordClassIndex(52095);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a$a  reason: collision with other inner class name */
    public static final class C1970a {
        static {
            Covode.recordClassIndex(52096);
        }

        private C1970a() {
        }

        public /* synthetic */ C1970a(byte b2) {
            this();
        }

        public static String a(c cVar) {
            if (cVar == null) {
                String.valueOf("invalid preload cache key, dataSource:" + ((String) null));
                return "";
            } else if (hl.a(cVar.a())) {
                return cVar.a() + '_' + et.a(cVar.e());
            } else {
                return "";
            }
        }

        public static String a(Long l2) {
            String str;
            if (l2 != null) {
                float longValue = (float) l2.longValue();
                if (longValue > 1048576.0f) {
                    StringBuilder sb = new StringBuilder();
                    String a2 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(longValue / 1048576.0f)}, 1));
                    l.b(a2, "");
                    str = sb.append(a2).append("MB").toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    String a3 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(longValue / 1024.0f)}, 1));
                    l.b(a3, "");
                    str = sb2.append(a3).append("KB").toString();
                }
            } else {
                str = null;
            }
            return String.valueOf(str);
        }
    }

    static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f83481a;

        static {
            Covode.recordClassIndex(52097);
        }

        b(String str) {
            this.f83481a = str;
        }

        @Override // com.ss.ttvideoengine.j
        public final void a(p pVar) {
            Long l2;
            Long l3;
            l.b(pVar, "");
            int i2 = pVar.f153145a;
            if (i2 == 2) {
                StringBuilder append = new StringBuilder("preload success, key(").append(this.f83481a).append("), preloadSize(");
                d.f fVar = pVar.f153147c;
                String str = null;
                if (fVar != null) {
                    l2 = Long.valueOf(fVar.f152455e);
                } else {
                    l2 = null;
                }
                StringBuilder append2 = append.append(C1970a.a(l2)).append("), mediaSize(");
                d.f fVar2 = pVar.f153147c;
                if (fVar2 != null) {
                    l3 = Long.valueOf(fVar2.f152454d);
                } else {
                    l3 = null;
                }
                StringBuilder append3 = append2.append(C1970a.a(l3)).append("), path(");
                d.f fVar3 = pVar.f153147c;
                if (fVar3 != null) {
                    str = fVar3.f152453c;
                }
                String.valueOf(append3.append(str).append(')').toString());
            } else if (i2 == 3) {
                String.valueOf("Preload failed associated with special key(" + this.f83481a + ')');
            }
        }
    }
}
