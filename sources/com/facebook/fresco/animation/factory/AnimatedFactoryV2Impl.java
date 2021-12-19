package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.b.i;
import com.facebook.common.d.k;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.a.b.a;
import com.facebook.imagepipeline.a.b.d;
import com.facebook.imagepipeline.a.c.b;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.j.c;

public class AnimatedFactoryV2Impl implements a {
    public static int sAnimationCachingStrategy = 1;
    private b mAnimatedDrawableBackendProvider;
    private com.facebook.imagepipeline.h.a mAnimatedDrawableFactory;
    private com.facebook.imagepipeline.a.d.a mAnimatedDrawableUtil;
    private d mAnimatedImageFactory;
    private final h<e, c> mBackingCache;
    private final com.facebook.imagepipeline.e.e mExecutorSupplier;
    private final f mPlatformBitmapFactory;

    static {
        Covode.recordClassIndex(28853);
    }

    private d buildAnimatedImageFactory() {
        return new com.facebook.imagepipeline.a.b.e(new b() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass6 */

            static {
                Covode.recordClassIndex(28859);
            }

            @Override // com.facebook.imagepipeline.a.c.b
            public final com.facebook.imagepipeline.a.a.a a(com.facebook.imagepipeline.a.a.e eVar, Rect rect) {
                return new com.facebook.imagepipeline.a.c.a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), eVar, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    private b getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new b() {
                /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(28858);
                }

                @Override // com.facebook.imagepipeline.a.c.b
                public final com.facebook.imagepipeline.a.a.a a(com.facebook.imagepipeline.a.a.e eVar, Rect rect) {
                    return new com.facebook.imagepipeline.a.c.a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), eVar, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public com.facebook.imagepipeline.a.d.a getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new com.facebook.imagepipeline.a.d.a();
        }
        return this.mAnimatedDrawableUtil;
    }

    public d getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    private a createDrawableFactory() {
        AnonymousClass3 r7 = new k<Integer>() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(28856);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.d.k
            public final /* synthetic */ Integer b() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }
        };
        return new a(getAnimatedDrawableBackendProvider(), i.b(), new com.facebook.common.b.c(this.mExecutorSupplier.c()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, r7, new k<Integer>() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass4 */

            static {
                Covode.recordClassIndex(28857);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.facebook.common.d.k
            public final /* synthetic */ Integer b() {
                return 3;
            }
        });
    }

    public static void setAnimationCachingStrategy(int i2) {
        sAnimationCachingStrategy = i2;
    }

    @Override // com.facebook.imagepipeline.a.b.a
    public com.facebook.imagepipeline.g.c getGifDecoder(final Bitmap.Config config) {
        return new com.facebook.imagepipeline.g.c() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28854);
            }

            @Override // com.facebook.imagepipeline.g.c
            public final c a(com.facebook.imagepipeline.j.e eVar, int i2, com.facebook.imagepipeline.j.h hVar, com.facebook.imagepipeline.common.b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().a(eVar, bVar);
            }
        };
    }

    @Override // com.facebook.imagepipeline.a.b.a
    public com.facebook.imagepipeline.g.c getWebPDecoder(final Bitmap.Config config) {
        return new com.facebook.imagepipeline.g.c() {
            /* class com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28855);
            }

            @Override // com.facebook.imagepipeline.g.c
            public final c a(com.facebook.imagepipeline.j.e eVar, int i2, com.facebook.imagepipeline.j.h hVar, com.facebook.imagepipeline.common.b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().b(eVar, bVar);
            }
        };
    }

    @Override // com.facebook.imagepipeline.a.b.a
    public com.facebook.imagepipeline.h.a getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    public AnimatedFactoryV2Impl(f fVar, com.facebook.imagepipeline.e.e eVar, h<e, c> hVar) {
        this.mPlatformBitmapFactory = fVar;
        this.mExecutorSupplier = eVar;
        this.mBackingCache = hVar;
    }
}
