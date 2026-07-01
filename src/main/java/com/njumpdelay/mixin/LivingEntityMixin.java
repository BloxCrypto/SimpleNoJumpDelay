package com.njumpdelay.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    private int jumpingCooldown;

    @Inject(method = "tick()V", at = @At("TAIL"))
    private void clearJumpCooldown(CallbackInfo ci) {
        this.jumpingCooldown = 0;
    }
}