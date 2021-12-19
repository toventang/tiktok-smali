package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a<DownloadsViewModel> {
    static {
        Covode.recordClassIndex(48103);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "download";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String d() {
        String d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
            return this.f77467d.getString(R.string.ca9);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final void b(int i2) {
        if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
            b.a.a(3);
        }
        super.b(i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$a  reason: collision with other inner class name */
    static final class C1803a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $newTag;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1803a(a aVar, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$newTag = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.b(R.string.bc3, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a.C1803a.AnonymousClass1 */
                final /* synthetic */ C1803a this$0;

                static {
                    Covode.recordClassIndex(48107);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.b(this.this$0.$newTag);
                    return z.f158842a;
                }
            });
            bVar2.a(R.string.bc2, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final boolean a(int i2) {
        if (i2 != 3) {
            l.d("download_setting_change_young", "");
            com.ss.android.ugc.aweme.compliance.api.model.m a2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.a("download_setting_change_young");
            if (a2 != null && a2.f76684a == 1) {
                c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f77467d).a(R.string.bc5).b(R.string.bc4), new C1803a(this, i2)).a().b().show();
                com.ss.android.ugc.aweme.compliance.privacy.data.b.b("download_setting_change_young");
                return true;
            }
        }
        return super.a(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
            r3 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r4, r1)
            h.f.b.l.d(r5, r1)
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x0011
            h.f.b.l.b()
        L_0x0011:
            h.f.b.l.b(r0, r1)
            r3.<init>(r4, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g
            r1.<init>()
            r0 = 1
            r2 = 0
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r3.a(r1, r2, r0)
            r0 = 2131823465(0x7f110b69, float:1.927973E38)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r1.a(r0)
            r0 = 2131823464(0x7f110b68, float:1.9279728E38)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r1.b(r0)
            r0 = 3
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r0 = r1.a(r2, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.f r0 = r0.a()
            r3.a(r0)
            androidx.lifecycle.t<java.lang.Integer> r1 = r4.f77673d
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$1 r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$1
            r0.<init>(r3)
            r1.observe(r5, r0)
            androidx.lifecycle.t<java.lang.Boolean> r1 = r4.f77674e
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$2 r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$2
            r0.<init>(r3)
            r1.observe(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsViewModel, androidx.fragment.app.Fragment):void");
    }
}
