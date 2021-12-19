package com.kakao.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DefaultKakaoUtilService implements KakaoUtilService {
    private static final List<String> ALLOWED_PACKAGES = Arrays.asList("com.kakao.talk", "com.kakao.onetalk", "com.kakao.story");
    private static final List<String> ALLOWED_SIGNATURES = Arrays.asList("308201db30820144a00302010202044c707197300d06092a864886f70d01010505003031310b3009060355040613026b6f310e300c060355040a13056b616b616f31123010060355040b13096b616b616f7465616d3020170d3130303832323030333834375a180f32313130303732393030333834375a3031310b3009060355040613026b6f310e300c060355040a13056b616b616f31123010060355040b13096b616b616f7465616d30819f300d06092a864886f70d010101050003818d0030818902818100aef387bc86e022a87e66b8c42153284f18e0c468cf9c87a241b989729dfdad3dd9e1847546d01a2819ba77f3974a47b473c926acae173fd90c7e635000721feeef6705da7ae949a35b82900a0f67d9464d73ed8a98c37f4ac70729494a17469bc40d4ee06d043b09147ebadc55fa1020968d7036c5fb9b8c148cba1d8e9d9fc10203010001300d06092a864886f70d0101050500038181005569be704c68cff6221c1e04dd8a131110f9f5cd2138042286337fd6014a1b1d2d3eeb266ae1630afe56bf63c07dd0b5c8fad46dcb9f802f9a7802fb89eb3b4777b9665bb1ed9feaf1dc7cac4f91abedfc81187ff6d2f471dbd12335d2c0ef0e2ee719df6e763f814b9ac91f8be37fd11d40686700d66be6de22a1836f060f01", "308201e53082014ea00302010202044f4ae542300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3132303232373032303635385a170d3432303231393032303635385a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d0030818902818100c0b41c25ef21a39a13ce89c82dc3a14bf9ef0c3094aa2ac1bf755c9699535e79119e8b980c0ecdcc51f259eb0d8b2077d41de8fcfdeaac3f386c05e2a684ecb5504b660ad7d5a01cce35899f96bcbd099c9dcb274c6eb41fef861616a12fb45bc57a19683a8a97ab1a33d9c70128878b67dd1b3a388ad5121d1d66ff04c065ff0203010001300d06092a864886f70d0101050500038181000418a7dacb6d13eb61c8270fe1fdd006eb66d0ff9f58f475defd8dc1fb11c41e34ce924531d1fd8ad26d9479d64f54851bf57b8dfe3a5d6f0a01dcad5b8c36ac4ac48caeff37888c36483c26b09aaa9689dbb896938d5afe40135bf7d9f12643046301867165d28be0baa3513a5084e182f7f9c044d5baa58bdce55fa1845241", "30820303308201eba003020102020452441f49300d06092a864886f70d01010b05003031310b3009060355040613026b6f310e300c060355040a13056b616b616f31123010060355040b13096b616b616f7465616d3020170d3137303631393039353135315a180f33303135313032313039353135315a3031310b3009060355040613026b6f310e300c060355040a13056b616b616f31123010060355040b13096b616b616f7465616d30820122300d06092a864886f70d01010105000382010f003082010a0282010100c2867a4e6fb76eaa00d5ecac63c897ebd924bb40d3f7dd90f73599a2049ae40abc4c7b1dce10dafbfdabbebf3653d7c6a18a3ade469dbe5bd0590748aae4151491001eadd8b02f7469646530595c028ed70feeacd7184fc5b0fd0ceb95addd03b7d18097a32a4afc830e209e25c65656587d891282c610429965cc44f3d63ea249d4df41453ac30ca1b3eaf4b1f8fc5cf41af4964f66f611b799f6246fcb1d6b42fff8cff202a433a90ccd25385c4d015ac770dedf8914d86c53b0eebdd4c5c5e3a509e360785fc38ee075b6d7faad19f7c876ff3949a85f601158f99c67ee14c20ff759d3057dc258146f579a5e3d90457d9996f004808f4aa625ab9a67dfc30203010001a321301f301d0603551d0e041604141487897f76c0e76161888c86336325b6e58fce5d300d06092a864886f70d01010b050003820101007bf867fa1b4ef0ea4d6de127238319c84dcae79398e60f960ab71a8bdf488b0aa07888e994bba531f4419037cd006b7d9a64860a6591b96534967444b8854bef6a6eff3161dbcbebfe5e6c979650c9d51f76676b217b8285992f4a172d4a857775c42dc3875796434b13b78d6cfb174bfaa0c59976fb7a1cd4d26527881cfd39a61cd35843dd2cd49afd7d3966947b2662fc44dbff3704094687ce70ccabeb8a9d93f39974bd11fdb1dcb9404d8a6408cae45c315ced013f088c5264ce9c8738715ecf83bc991d4e3971e4a2cc39bcd11be426d793638981455d083cfd7bfd3b88ecd11e581260ae7fbf27b8c9cdf0da49a467e375f4273d6e01d7114ac7126f");

    DefaultKakaoUtilService() {
    }

    static {
        Covode.recordClassIndex(34466);
    }

    private boolean validateTalkPackageName(String str) {
        return ALLOWED_PACKAGES.contains(str);
    }

    private boolean validateTalkSignature(PackageInfo packageInfo) {
        for (Signature signature : packageInfo.signatures) {
            if (ALLOWED_SIGNATURES.contains(signature.toCharsString())) {
                return true;
            }
        }
        return false;
    }

    private boolean validateTalkMinVersion(PackageInfo packageInfo, int i2) {
        if (packageInfo.versionCode >= i2) {
            return true;
        }
        return false;
    }

    private boolean validateTalkAuthenticity(Context context, String str, int i2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (!validateTalkMinVersion(packageInfo, i2) || !validateTalkPackageName(str) || !validateTalkSignature(packageInfo)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.kakao.util.KakaoUtilService
    public Intent resolveIntent(Context context, Intent intent, int i2) {
        if (intent == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (validateTalkAuthenticity(context, resolveInfo.activityInfo.applicationInfo.packageName, i2)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
                arrayList.add(intent2);
                arrayList2.add(new LabeledIntent(intent, resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.applicationInfo.labelRes, resolveInfo.activityInfo.applicationInfo.icon));
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Intent) arrayList.get(0);
        }
        Intent createChooser = Intent.createChooser((Intent) arrayList2.remove(0), context.getString(R.string.aix));
        if (arrayList2.size() > 0) {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Parcelable[arrayList2.size()]));
        }
        return createChooser;
    }
}
