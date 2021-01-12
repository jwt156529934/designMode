### 单例模式
#### 介绍
    这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
#### 结构
    单例模式的主要有以下角色：
    * 单例类。只能创建一个实例的类
    * 访问类。使用单例类
#### 存在的问题
    序列化和反射都可以破坏单例模式