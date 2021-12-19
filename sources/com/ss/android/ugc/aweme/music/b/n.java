package com.ss.android.ugc.aweme.music.b;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.c.c;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class n extends f<ExternalMusicInfo> {

    /* renamed from: a  reason: collision with root package name */
    public a f111368a;

    public interface a {
        static {
            Covode.recordClassIndex(71556);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(71555);
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f111369a;

        /* renamed from: b  reason: collision with root package name */
        public View f111370b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f111371c;

        /* renamed from: d  reason: collision with root package name */
        public WrapContentRemoteImageView f111372d;

        /* renamed from: e  reason: collision with root package name */
        Animation f111373e;

        static {
            Covode.recordClassIndex(71557);
        }

        public final void a() {
            ImageView imageView = this.f111371c;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            View view = this.f111369a;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        b(View view) {
            super(view);
            MethodCollector.i(11910);
            this.f111372d = (WrapContentRemoteImageView) view.findViewById(R.id.c21);
            this.f111370b = view.findViewById(R.id.flj);
            this.f111369a = view.findViewById(R.id.ekh);
            this.f111371c = (ImageView) view.findViewById(R.id.ekg);
            this.f111373e = AnimationUtils.loadAnimation(view.getContext(), R.anim.cw);
            this.f111372d.setOnClickListener(new o(this));
            MethodCollector.o(11910);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ali, viewGroup, false));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        ExternalMusicInfo externalMusicInfo;
        b bVar = (b) viewHolder;
        List list = this.f76354l;
        if (!com.bytedance.common.utility.collection.b.a((Collection) list) && i2 >= 0 && i2 < list.size() && (externalMusicInfo = (ExternalMusicInfo) list.get(i2)) != null) {
            if (!(bVar.f111369a == null || bVar.f111371c == null)) {
                bVar.f111369a.setVisibility(0);
                bVar.f111371c.startAnimation(bVar.f111373e);
            }
            if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                List<String> b2 = MusicService.m().b(externalMusicInfo.getPartnerName());
                if (!com.bytedance.common.utility.collection.b.a((Collection) b2) && bVar.f111372d != null) {
                    if (i2 == list.size() - 1) {
                        bVar.f111370b.setVisibility(8);
                    }
                    bVar.f111372d.a(b2.get(0), new c<com.facebook.imagepipeline.j.f>() {
                        /* class com.ss.android.ugc.aweme.music.b.n.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(71558);
                        }

                        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                        public final void onFailure(String str, Throwable th) {
                            super.onFailure(str, th);
                            b.this.a();
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
                        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                        public final /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
                            b.this.a();
                            b.this.f111372d.a(fVar);
                        }

                        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                        public final void onIntermediateImageFailed(String str, Throwable th) {
                            super.onIntermediateImageFailed(str, th);
                            b.this.a();
                            b.this.f111370b.setVisibility(8);
                            b.this.f111372d.setVisibility(8);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                            b.this.a();
                            b.this.f111372d.a(fVar);
                        }
                    });
                }
            }
        }
    }
}
