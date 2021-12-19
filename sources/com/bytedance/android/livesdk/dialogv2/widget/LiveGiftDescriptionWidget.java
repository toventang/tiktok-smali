package com.bytedance.android.livesdk.dialogv2.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.bi;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.j;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.w;
import com.bytedance.android.livesdk.service.b.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class LiveGiftDescriptionWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public a f17040a = a.IDLE;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f17041b;

    /* renamed from: c  reason: collision with root package name */
    public String f17042c;

    public enum a {
        IDLE,
        GIFT_DESCRIPTION_SHOW,
        TAB_DESCRIPTION_SHOW;

        static {
            Covode.recordClassIndex(9466);
        }
    }

    static {
        Covode.recordClassIndex(9465);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgy;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.f17041b = (ImageView) findViewById(R.id.ee0);
        findViewById(R.id.ee1).setOnClickListener(new c(this));
        this.dataChannel.a((m) this, bi.class, (h.f.a.b) new b(this, (ImageView) findViewById(R.id.c9t), (LiveTextView) findViewById(R.id.bav)));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftDescriptionWidget f17047a;

        static {
            Covode.recordClassIndex(9471);
        }

        c(LiveGiftDescriptionWidget liveGiftDescriptionWidget) {
            this.f17047a = liveGiftDescriptionWidget;
        }

        public final void onClick(View view) {
            if (this.f17047a.f17040a == a.TAB_DESCRIPTION_SHOW) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (this.f17047a.f17042c != null) {
                    if (room != null) {
                        User owner = room.getOwner();
                        if (owner == null || !owner.isSubscribed()) {
                            Context context = this.f17047a.context;
                            l.b(context, "");
                            ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(context, room, "gift_bar");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (room == null) {
                    return;
                }
                Context context2 = this.f17047a.context;
                l.b(context2, "");
                ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeState(context2, room, "gift_bar");
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.service.b.a, z> {
        final /* synthetic */ LiveTextView $mGiftDescriptionTv;
        final /* synthetic */ ImageView $mLeftIcon;
        final /* synthetic */ LiveGiftDescriptionWidget this$0;

        static {
            Covode.recordClassIndex(9467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LiveGiftDescriptionWidget liveGiftDescriptionWidget, ImageView imageView, LiveTextView liveTextView) {
            super(1);
            this.this$0 = liveGiftDescriptionWidget;
            this.$mLeftIcon = imageView;
            this.$mGiftDescriptionTv = liveTextView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.service.b.a aVar) {
            w wVar;
            ImageModel imageModel;
            w wVar2;
            ImageModel imageModel2;
            com.bytedance.android.livesdk.model.message.c.b bVar;
            com.bytedance.android.livesdk.service.b.a aVar2 = aVar;
            l.d(aVar2, "");
            LiveGiftDescriptionWidget liveGiftDescriptionWidget = this.this$0;
            a.EnumC0451a aVar3 = aVar2.f21278a;
            boolean z = true;
            if (aVar3 != null) {
                int i2 = b.f17085a[aVar3.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && liveGiftDescriptionWidget.f17040a == a.GIFT_DESCRIPTION_SHOW) {
                                liveGiftDescriptionWidget.f17040a = a.IDLE;
                            }
                        } else if (liveGiftDescriptionWidget.f17040a == a.IDLE) {
                            liveGiftDescriptionWidget.f17040a = a.GIFT_DESCRIPTION_SHOW;
                        }
                    } else if (liveGiftDescriptionWidget.f17040a == a.TAB_DESCRIPTION_SHOW || liveGiftDescriptionWidget.f17040a == a.GIFT_DESCRIPTION_SHOW) {
                        liveGiftDescriptionWidget.f17040a = a.IDLE;
                    }
                } else if (liveGiftDescriptionWidget.f17040a == a.IDLE || liveGiftDescriptionWidget.f17040a == a.GIFT_DESCRIPTION_SHOW) {
                    liveGiftDescriptionWidget.f17040a = a.TAB_DESCRIPTION_SHOW;
                }
            }
            com.bytedance.android.livesdk.model.message.c.b bVar2 = null;
            String str = null;
            if (this.this$0.f17040a == a.TAB_DESCRIPTION_SHOW && aVar2.f21278a == a.EnumC0451a.TAB_EVENT) {
                w wVar3 = aVar2.f21279b;
                if (!(wVar3 == null || wVar3.f19782a == null || (wVar2 = aVar2.f21279b) == null || wVar2.f19783b == null)) {
                    ImageView imageView = this.$mLeftIcon;
                    w wVar4 = aVar2.f21279b;
                    if (wVar4 != null) {
                        imageModel2 = wVar4.f19782a;
                    } else {
                        imageModel2 = null;
                    }
                    p.b(imageView, imageModel2);
                    LiveTextView liveTextView = this.$mGiftDescriptionTv;
                    l.b(liveTextView, "");
                    w wVar5 = aVar2.f21279b;
                    if (wVar5 != null) {
                        bVar = wVar5.f19783b;
                    } else {
                        bVar = null;
                    }
                    liveTextView.setText(com.bytedance.android.livesdk.w.a(bVar));
                    View view = this.this$0.getView();
                    if (view != null) {
                        view.post(new Runnable(this) {
                            /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.b.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ b f17044a;

                            static {
                                Covode.recordClassIndex(9468);
                            }

                            {
                                this.f17044a = r1;
                            }

                            public final void run() {
                                this.f17044a.this$0.show();
                            }
                        });
                    }
                    com.bytedance.android.livesdk.an.a.a().a(new j());
                    w wVar6 = aVar2.f21279b;
                    if (!(wVar6 == null || wVar6.f19784c == null)) {
                        LiveGiftDescriptionWidget liveGiftDescriptionWidget2 = this.this$0;
                        w wVar7 = aVar2.f21279b;
                        if (wVar7 != null) {
                            str = wVar7.f19784c;
                        }
                        liveGiftDescriptionWidget2.f17042c = str;
                    }
                    ImageView imageView2 = this.this$0.f17041b;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else if (this.this$0.f17040a == a.GIFT_DESCRIPTION_SHOW && (aVar2.f21278a == a.EnumC0451a.GIFT_EVENT || aVar2.f21278a == a.EnumC0451a.TAB_EVENT)) {
                w wVar8 = aVar2.f21279b;
                if (!(wVar8 == null || wVar8.f19782a == null || (wVar = aVar2.f21279b) == null || wVar.f19783b == null)) {
                    ImageView imageView3 = this.$mLeftIcon;
                    w wVar9 = aVar2.f21279b;
                    if (wVar9 != null) {
                        imageModel = wVar9.f19782a;
                    } else {
                        imageModel = null;
                    }
                    p.b(imageView3, imageModel);
                    LiveTextView liveTextView2 = this.$mGiftDescriptionTv;
                    l.b(liveTextView2, "");
                    w wVar10 = aVar2.f21279b;
                    if (wVar10 != null) {
                        bVar2 = wVar10.f19783b;
                    }
                    liveTextView2.setText(com.bytedance.android.livesdk.w.a(bVar2));
                    com.bytedance.android.livesdk.an.a.a().a(new j());
                    View view2 = this.this$0.getView();
                    if (view2 != null) {
                        view2.post(new Runnable(this) {
                            /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.b.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ b f17045a;

                            static {
                                Covode.recordClassIndex(9469);
                            }

                            {
                                this.f17045a = r1;
                            }

                            public final void run() {
                                this.f17045a.this$0.show();
                            }
                        });
                    }
                }
                ImageView imageView4 = this.this$0.f17041b;
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
            } else if (this.this$0.f17040a == a.IDLE) {
                com.bytedance.android.livesdk.an.a.a().a(new j());
                View view3 = this.this$0.getView();
                if (view3 != null) {
                    view3.post(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.b.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f17046a;

                        static {
                            Covode.recordClassIndex(9470);
                        }

                        {
                            this.f17046a = r1;
                        }

                        public final void run() {
                            this.f17046a.this$0.hide();
                        }
                    });
                }
            }
            com.bytedance.android.livesdk.dialogv2.viewmodel.a aVar4 = a.C0355a.C0356a.f17017a;
            if (this.this$0.f17040a != a.TAB_DESCRIPTION_SHOW) {
                z = false;
            }
            aVar4.f17015k = z;
            return z.f158842a;
        }
    }
}
