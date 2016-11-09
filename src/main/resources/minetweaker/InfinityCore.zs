import mods.nei.NEI;

NEI.hide(<InfinityCore:itemDummy:*>);

recipes.addShaped(<InfinityCore:itemKami:4>, [
    [null, <HardcoreEnderExpansion:bucket_ender_goo>.giveBack(<minecraft:bucket>), null],
    [<HardcoreEnderExpansion:bucket_ender_goo>.giveBack(<minecraft:bucket>), <Railcraft:firestone.refined>.noReturn(), <HardcoreEnderExpansion:bucket_ender_goo>.giveBack(<minecraft:bucket>)],
    [null, <HardcoreEnderExpansion:bucket_ender_goo>.giveBack(<minecraft:bucket>), null]]);