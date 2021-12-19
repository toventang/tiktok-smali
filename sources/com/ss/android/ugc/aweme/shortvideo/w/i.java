package com.ss.android.ugc.aweme.shortvideo.w;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.p;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.dj;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.record.av;
import com.ss.android.ugc.aweme.shortvideo.record.b;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ae;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.w.d;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.tools.utils.q;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class i {
    static {
        Covode.recordClassIndex(86862);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<g.b, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ com.bytedance.creativex.recorder.b.a.z $cameraApiComponent;
        final /* synthetic */ b $componentConfigBuilder = null;
        final /* synthetic */ ShortVideoContext $shortVideoContext;

        static {
            Covode.recordClassIndex(86863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.creativex.recorder.b.a.z zVar, e eVar, ShortVideoContext shortVideoContext, b bVar) {
            super(1);
            this.$cameraApiComponent = zVar;
            this.$activity = eVar;
            this.$shortVideoContext = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g.b bVar) {
            g.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(c.f132674a);
            bVar2.a(new j(com.ss.android.ugc.aweme.property.b.d(), com.ss.android.ugc.aweme.property.b.c(), dj.a(), av.a()));
            final boolean a2 = bn.a();
            AnonymousClass1 r0 = new h.f.a.a<Boolean>() {
                /* class com.ss.android.ugc.aweme.shortvideo.w.i.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(86864);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(a2);
                }
            };
            l.d(r0, "");
            bVar2.f132697d = r0;
            bVar2.b(AnonymousClass2.f132740a);
            com.bytedance.creativex.recorder.b.a.z zVar = this.$cameraApiComponent;
            l.d(zVar, "");
            bVar2.f132698e = new d.a(zVar);
            Context applicationContext = this.$activity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext, "");
            l.d(applicationContext, "");
            bVar2.f132699f = new d.b();
            bVar2.a(AnonymousClass3.f132741a);
            bVar2.a(new com.ss.android.ugc.aweme.shortvideo.record.b(new b.a(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.w.i.a.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f132742a;

                static {
                    Covode.recordClassIndex(86867);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.record.b.a
                public final void a() {
                    b.a.f132249a.start("av_video_stop_record", "stopRecordAsync");
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.record.b.a
                public final void b() {
                    q.d("MultiEditlog: stopRecordAsync ret = ret");
                    this.f132742a.$cameraApiComponent.D().getEndFrameTimeUS();
                    b.a.f132249a.end("av_video_stop_record", "stopRecordAsync#callback");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f132742a = r1;
                }
            }));
            bVar2.f132702i = true;
            bVar2.f132703j = new ae(this.$cameraApiComponent, this.$shortVideoContext);
            bVar2.a(AnonymousClass5.f132743a);
            bVar2.o = com.ss.android.ugc.aweme.setting.i.d.a();
            h.f.a.b bVar3 = this.$componentConfigBuilder;
            if (bVar3 != null) {
                bVar3.invoke(bVar2);
            }
            return z.f158842a;
        }
    }

    public static final n a(f fVar, ShortVideoContext shortVideoContext) {
        l.d(fVar, "");
        l.d(shortVideoContext, "");
        com.bytedance.creativex.recorder.b.a.z zVar = (com.bytedance.creativex.recorder.b.a.z) fVar.a(com.bytedance.creativex.recorder.b.a.z.class, (String) null);
        e eVar = (e) fVar.a(e.class, (String) null);
        n nVar = new n(fVar, new a(zVar, eVar, (ShortVideoContext) fVar.a(ShortVideoContext.class, (String) null), null));
        nVar.a(p.class, new com.ss.android.ugc.aweme.shortvideo.av(eVar, zVar, nVar, shortVideoContext, (c) fVar.a(c.class, (String) null)));
        return nVar;
    }
}
