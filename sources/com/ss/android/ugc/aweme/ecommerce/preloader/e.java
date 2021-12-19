package com.ss.android.ugc.aweme.ecommerce.preloader;

import android.graphics.drawable.BitmapDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import h.z;
import kotlinx.coroutines.am;

public final class e {
    static {
        Covode.recordClassIndex(54524);
    }

    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ Image $image;
        final /* synthetic */ SmartImageView $this_tryLowResolutionPlaceholderImage;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        static {
            Covode.recordClassIndex(54525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SmartImageView smartImageView, Image image, d dVar) {
            super(2, dVar);
            this.$this_tryLowResolutionPlaceholderImage = smartImageView;
            this.$image = image;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$this_tryLowResolutionPlaceholderImage, this.$image, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.e$a$a  reason: collision with other inner class name */
        public static final class C2094a extends k implements m<am, d<? super z>, Object> {
            final /* synthetic */ BitmapDrawable $bitmapDrawable;
            final /* synthetic */ boolean $hasImageCache$inlined;
            final /* synthetic */ z.a $hasSmallImageCache$inlined;
            int label;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(54526);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2094a(BitmapDrawable bitmapDrawable, d dVar, a aVar, z.a aVar2, boolean z) {
                super(2, dVar);
                this.$bitmapDrawable = bitmapDrawable;
                this.this$0 = aVar;
                this.$hasSmallImageCache$inlined = aVar2;
                this.$hasImageCache$inlined = z;
            }

            @Override // h.c.b.a.a
            public final d<h.z> create(Object obj, d<?> dVar) {
                l.d(dVar, "");
                return new C2094a(this.$bitmapDrawable, dVar, this.this$0, this.$hasSmallImageCache$inlined, this.$hasImageCache$inlined);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, d<? super h.z> dVar) {
                return ((C2094a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    if (this.this$0.$this_tryLowResolutionPlaceholderImage.getWindowVisibility() == 0) {
                        ((com.facebook.drawee.f.a) this.this$0.$this_tryLowResolutionPlaceholderImage.getHierarchy()).a(this.$bitmapDrawable, q.b.f47442h);
                    }
                    return h.z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.preloader.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
