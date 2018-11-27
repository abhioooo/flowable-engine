drop table if exists ACT_RE_DEPLOYMENT cascade constraints;
drop table if exists ACT_RE_MODEL cascade constraints;
drop table if exists ACT_RU_EXECUTION cascade constraints;
drop table if exists ACT_RE_PROCDEF cascade constraints;
drop table if exists ACT_RU_EVENT_SUBSCR cascade constraints;
drop table if exists ACT_EVT_LOG cascade constraints;
drop table if exists ACT_PROCDEF_INFO cascade constraints;
drop table if exists ACT_RU_PROCESS_MIGRATION_BATCH cascade constraints;

drop index if exists ACT_IDX_EXEC_BUSKEY;
drop index if exists ACT_IDX_VARIABLE_TASK_ID;
drop index if exists ACT_IDX_EVENT_SUBSCR_CONFIG_;
drop index if exists ACT_IDX_ATHRZ_PROCEDEF;
drop index if exists ACT_IDX_INFO_PROCDEF;
drop index if exists ACT_IDX_PROCESS_MIGRATION_BATCH;