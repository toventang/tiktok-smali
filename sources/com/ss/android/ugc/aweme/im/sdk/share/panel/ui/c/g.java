package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class g extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final a f103485d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AvatarImageView f103486a;

    /* renamed from: b  reason: collision with root package name */
    public final int f103487b = 2131232794;

    /* renamed from: c  reason: collision with root package name */
    public IMContact f103488c;

    static {
        Covode.recordClassIndex(66308);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66312);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, final SharePanelViewModel sharePanelViewModel) {
        super(view);
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        View findViewById = view.findViewById(R.id.a6_);
        l.b(findViewById, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById;
        this.f103486a = avatarImageView;
        avatarImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f103489a;

            static {
                Covode.recordClassIndex(66309);
            }

            {
                this.f103489a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                final AnonymousClass1 r4 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g.AnonymousClass1.AnonymousClass1 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(66310);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        a();
                        return z.f158842a;
                    }

                    public final void a() {
                        if (b.b().getUnder16Proxy() != null) {
                            IIMunder16Proxy under16Proxy = b.b().getUnder16Proxy();
                            if (under16Proxy.c()) {
                                if (under16Proxy != null) {
                                    under16Proxy.h();
                                    return;
                                }
                                return;
                            }
                        }
                        SharePanelViewModel sharePanelViewModel = sharePanelViewModel;
                        IMContact iMContact = this.this$0.f103489a.f103488c;
                        if (iMContact == null) {
                            l.b();
                        }
                        sharePanelViewModel.a(iMContact, true);
                    }
                };
                SharePackage sharePackage = sharePanelViewModel.f103597d;
                if (sharePackage != null) {
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    sharePackage.a(context, (com.ss.android.ugc.aweme.sharer.b) null, new h.f.a.a<z>() {
                        /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(66311);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            r4.a();
                            return z.f158842a;
                        }
                    });
                    return;
                }
                r4.a();
            }
        });
    }
}
