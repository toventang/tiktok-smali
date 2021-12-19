package com.ss.android.ugc.aweme.story.record.recordcontrol;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.dj;
import com.ss.android.ugc.aweme.shortvideo.record.b;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.shortvideo.w.j;
import com.ss.android.ugc.aweme.story.record.j.d;
import com.ss.android.ugc.aweme.story.record.recordcontrol.d;
import com.ss.android.ugc.tools.utils.q;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f138421a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(90528);
    }

    public static final class a extends m implements b<g.b, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ com.ss.android.ugc.aweme.story.record.a.a $cameraApiComponent;
        final /* synthetic */ b $componentConfigBuilder = null;

        static {
            Covode.recordClassIndex(90529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, com.ss.android.ugc.aweme.story.record.a.a aVar) {
            super(1);
            this.$activity = eVar;
            this.$cameraApiComponent = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g.b bVar) {
            g.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(c.f138420a);
            bVar2.a(new j(com.ss.android.ugc.aweme.property.b.d(), com.ss.android.ugc.aweme.property.b.c(), dj.a(), d.a()));
            bVar2.b(AnonymousClass1.f138422a);
            Context applicationContext = this.$activity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext, "");
            l.d(applicationContext, "");
            bVar2.f132699f = new d.a();
            bVar2.a(AnonymousClass2.f138423a);
            bVar2.a(new com.ss.android.ugc.aweme.shortvideo.record.b(new b.a(this) {
                /* class com.ss.android.ugc.aweme.story.record.recordcontrol.f.a.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f138424a;

                static {
                    Covode.recordClassIndex(90532);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.record.b.a
                public final void a() {
                    b.a.f132249a.start("av_video_stop_record", "stopRecordAsync");
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.record.b.a
                public final void b() {
                    q.d("MultiEditlog: stopRecordAsync ret = ret");
                    this.f138424a.$cameraApiComponent.D().getEndFrameTimeUS();
                    b.a.f132249a.end("av_video_stop_record", "stopRecordAsync#callback");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f138424a = r1;
                }
            }));
            bVar2.f132702i = true;
            bVar2.f132703j = new g(this.$cameraApiComponent);
            bVar2.a(AnonymousClass4.f138425a);
            bVar2.o = com.ss.android.ugc.aweme.setting.i.d.a();
            h.f.a.b bVar3 = this.$componentConfigBuilder;
            if (bVar3 != null) {
                bVar3.invoke(bVar2);
            }
            return z.f158842a;
        }
    }
}
