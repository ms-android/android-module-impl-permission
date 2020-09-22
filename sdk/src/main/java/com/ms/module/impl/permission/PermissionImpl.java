package com.ms.module.impl.permission;


import androidx.fragment.app.FragmentActivity;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.permission.IPermission;
import com.ms.module.supers.inter.permission.PermissionCallBack;

/**
 * 权限实现类
 * 反射使用
 */
public class PermissionImpl implements IPermission {

    @Override
    public void request(FragmentActivity fragmentActivity, final PermissionCallBack iCallBack, String... strings) {

        PermissionUtilsImpl.requestPermission(fragmentActivity, iCallBack, strings);

    }
}
