# 项目Git开发规范
## 1. 分支命名规范
格式：`类型/简短描述`
类型可选：
- feat：新功能
- fix：bug修复
- refactor：代码重构，不改变功能
- docs：文档修改
- style：代码格式化（无逻辑改动）
- test：单元测试、JUnit测试代码
- chore：修改pom、依赖、配置文件

示例：
feat/user-login
fix/mysql-conn-error
test/user-service

> 保护分支：main，禁止直接push，只能通过PR合并
## 2. Commit Message 提交规范
格式：`类型(模块): 描述`
类型同上。
✅ 正确示例：
feat(user): 新增登录接口
fix(mapper): 修复时间字段映射报错
test(user): 编写UserService单元测试
chore(pom): 升级snakeyaml版本修复漏洞
❌ 禁止：随便写“改代码”“修复bug”

## 3. PR合并请求规范
提PR前必须自测：
1. 本地执行 mvn test 全部通过
2. 本地 mvn verify 无报错
3. 拉取main最新代码，解决冲突
PR必须至少1人Review，全部问题修复完成才能合并；优先使用 Squash and merge（挤压合并）

## 4. Release Tag版本规范
语义化版本：v主.次.补丁
v1.0.0 初始稳定版
v1.0.1 bug修复
v1.1.0 新增功能
打tag命令：
git tag -a v1.0.0 -m "v1.0.0 稳定版本"
git push origin v1.0.0
