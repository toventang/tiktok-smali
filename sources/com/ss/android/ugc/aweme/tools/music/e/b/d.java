package com.ss.android.ugc.aweme.tools.music.e.b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.tools.view.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class d extends f<MusicModel> {

    /* renamed from: a  reason: collision with root package name */
    int f140502a = -1;

    /* renamed from: b  reason: collision with root package name */
    public View f140503b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.port.in.a.f f140504c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f140505d;

    static {
        Covode.recordClassIndex(91768);
    }

    static final class a implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a f140507b;

        static {
            Covode.recordClassIndex(91769);
        }

        a(d dVar, c.a aVar) {
            this.f140506a = dVar;
            this.f140507b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f140507b.a();
        }
    }

    public static String l() {
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null) {
            return cVar.getMusicId();
        }
        return null;
    }

    public d(com.ss.android.ugc.aweme.port.in.a.f fVar) {
        l.d(fVar, "");
        this.f140504c = fVar;
    }

    public final void a(int i2) {
        this.f140502a = i2;
        if (!com.ss.android.ugc.tools.utils.d.a(this.f76354l)) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f140505d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
    }

    public final void a(c.a aVar) {
        a((h.a) new a(this, aVar));
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        l.d(view, "");
        return (int) n.b(view.getContext(), 48.0f);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        this.f140503b = a_.itemView;
        RecyclerView.j jVar = new RecyclerView.j(-1, (int) n.b(viewGroup.getContext(), 48.0f));
        View view = this.f140503b;
        if (view != null) {
            view.setLayoutParams(jVar);
        }
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        l.b(from, "");
        l.d(from, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(from, R.layout.bif, viewGroup, false);
        l.b(a2, "");
        return new e(a2, this.f140504c);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        MusicModel musicModel;
        boolean a2;
        boolean z;
        MusicModel.CollectionType collectionType;
        String a3;
        String picPremium;
        String str;
        String name;
        String str2;
        l.d(viewHolder, "");
        if (viewHolder instanceof e) {
            List list = this.f76354l;
            if (list != null) {
                musicModel = (MusicModel) h.a.n.b(list, i2);
            } else {
                musicModel = null;
            }
            e eVar = (e) viewHolder;
            boolean z2 = false;
            if (musicModel == null) {
                a2 = false;
            } else {
                a2 = l.a((Object) l(), (Object) musicModel.getMusicId());
            }
            if (this.f140502a == i2) {
                z = true;
            } else {
                z = false;
            }
            if (musicModel == null || (name = musicModel.getName()) == null || name.length() == 0) {
                TextView textView = eVar.f140511c;
                if (textView != null) {
                    textView.setText("");
                }
            } else {
                TextView textView2 = eVar.f140511c;
                if (textView2 != null) {
                    if (musicModel != null) {
                        str2 = musicModel.getName();
                    } else {
                        str2 = null;
                    }
                    textView2.setText(str2);
                }
            }
            AVDmtImageTextView aVDmtImageTextView = eVar.f140509a;
            if (aVDmtImageTextView != null) {
                if (musicModel == null || (picPremium = musicModel.getPicPremium()) == null || picPremium.length() == 0) {
                    aVDmtImageTextView.a(new ColorDrawable(0));
                    aVDmtImageTextView.a();
                } else {
                    if (musicModel != null) {
                        str = musicModel.getPicPremium();
                    } else {
                        str = null;
                    }
                    aVDmtImageTextView.a(str);
                }
            }
            if (musicModel != null) {
                TextView textView3 = eVar.f140510b;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (!TextUtils.isEmpty(musicModel.getSinger())) {
                    TextView textView4 = eVar.f140512d;
                    if (textView4 != null) {
                        textView4.setText(musicModel.getSinger());
                    }
                } else {
                    TextView textView5 = eVar.f140512d;
                    if (textView5 != null) {
                        textView5.setText("");
                    }
                }
                String singer = musicModel.getSinger();
                if (singer == null) {
                    singer = "";
                }
                if (musicModel != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = eVar.f140509a;
                    if (aVDmtImageTextView2 != null) {
                        aVDmtImageTextView2.a(a2);
                    }
                    if (a2) {
                        TextView textView6 = eVar.f140511c;
                        if (textView6 != null) {
                            Context context = textView6.getContext();
                            l.b(context, "");
                            textView6.setTextColor(context.getResources().getColor(R.color.bh));
                            ViewGroup.LayoutParams layoutParams = textView6.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd((int) n.b(textView6.getContext(), 88.0f));
                            textView6.setLayoutParams(marginLayoutParams);
                        }
                        ImageView imageView = eVar.f140513e;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        if (eVar.f140515g.a()) {
                            ImageView imageView2 = eVar.f140513e;
                            if (imageView2 != null) {
                                imageView2.setAlpha(1.0f);
                            }
                            ImageView imageView3 = eVar.f140513e;
                            if (imageView3 != null) {
                                imageView3.setEnabled(true);
                            }
                        } else {
                            ImageView imageView4 = eVar.f140513e;
                            if (imageView4 != null) {
                                imageView4.setAlpha(0.5f);
                            }
                            ImageView imageView5 = eVar.f140513e;
                            if (imageView5 != null) {
                                imageView5.setEnabled(false);
                            }
                        }
                        ImageView imageView6 = eVar.f140514f;
                        if (imageView6 != null) {
                            imageView6.setVisibility(0);
                        }
                        TextView textView7 = eVar.f140512d;
                        if (textView7 != null) {
                            int a4 = n.a(textView7.getContext()) - ((int) n.b(textView7.getContext(), 211.0f));
                            Paint paint = textView7.getPaint();
                            if (paint == null) {
                                paint = new Paint();
                            }
                            if (paint.measureText(singer) > ((float) a4)) {
                                ViewGroup.LayoutParams layoutParams2 = textView7.getLayoutParams();
                                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                                layoutParams3.width = a4;
                                textView7.setLayoutParams(layoutParams3);
                            } else {
                                textView7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            }
                        }
                    } else {
                        TextView textView8 = eVar.f140511c;
                        if (textView8 != null) {
                            Context context2 = textView8.getContext();
                            l.b(context2, "");
                            textView8.setTextColor(context2.getResources().getColor(R.color.a9));
                            ViewGroup.LayoutParams layoutParams4 = textView8.getLayoutParams();
                            Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams2.setMarginEnd((int) n.b(textView8.getContext(), 16.0f));
                            textView8.setLayoutParams(marginLayoutParams2);
                        }
                        TextView textView9 = eVar.f140512d;
                        if (textView9 != null) {
                            int a5 = n.a(textView9.getContext()) - ((int) n.b(textView9.getContext(), 150.0f));
                            Paint paint2 = textView9.getPaint();
                            if (paint2 == null) {
                                paint2 = new Paint();
                            }
                            if (paint2.measureText(singer) > ((float) a5)) {
                                ViewGroup.LayoutParams layoutParams5 = textView9.getLayoutParams();
                                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                                layoutParams6.width = a5;
                                textView9.setLayoutParams(layoutParams6);
                            } else {
                                textView9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            }
                        }
                        ImageView imageView7 = eVar.f140513e;
                        if (imageView7 != null) {
                            imageView7.setVisibility(4);
                        }
                        ImageView imageView8 = eVar.f140514f;
                        if (imageView8 != null) {
                            imageView8.setVisibility(4);
                        }
                    }
                    TextView textView10 = eVar.f140510b;
                    if (textView10 != null) {
                        StringBuilder sb = new StringBuilder(" · ");
                        int presenterDuration = musicModel.getPresenterDuration() / 1000;
                        int i3 = presenterDuration % 60;
                        int i4 = presenterDuration / 60;
                        int i5 = i4 / 60;
                        int i6 = i4 % 60;
                        if (i5 == 0) {
                            a3 = com.a.a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
                            l.b(a3, "");
                        } else {
                            a3 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
                            l.b(a3, "");
                        }
                        textView10.setText(sb.append(a3).toString());
                    }
                }
            } else {
                TextView textView11 = eVar.f140510b;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
            }
            if (z) {
                AVDmtImageTextView aVDmtImageTextView3 = eVar.f140509a;
                if (aVDmtImageTextView3 != null) {
                    aVDmtImageTextView3.a(0.66f);
                }
                AVDmtImageTextView aVDmtImageTextView4 = eVar.f140509a;
                if (aVDmtImageTextView4 != null) {
                    aVDmtImageTextView4.b(true);
                }
            } else {
                AVDmtImageTextView aVDmtImageTextView5 = eVar.f140509a;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.a(1.0f);
                }
                AVDmtImageTextView aVDmtImageTextView6 = eVar.f140509a;
                if (aVDmtImageTextView6 != null) {
                    aVDmtImageTextView6.b(false);
                }
            }
            ImageView imageView9 = eVar.f140514f;
            if (imageView9 != null) {
                if (musicModel != null) {
                    collectionType = musicModel.getCollectionType();
                } else {
                    collectionType = null;
                }
                if (collectionType != MusicModel.CollectionType.NOT_COLLECTED) {
                    z2 = true;
                }
                imageView9.setSelected(z2);
            }
            if (musicModel != null) {
                this.f140504c.a(musicModel, i2);
            }
        }
    }
}
