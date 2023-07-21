set interfaces bridge br0 member interface eth0
set interfaces bridge br0 member interface eth0.1
set interfaces bridge br0 member interface eth0.11
set interfaces bridge br0 member interface eth0.12
set interfaces bridge br0 member interface eth0.13
set interfaces bridge br0 member interface eth0.14
set interfaces bridge br0 member interface eth0.15
set interfaces bridge br0 member interface eth0.16
set interfaces bridge br0 member interface eth0.17
set interfaces bridge br0 member interface eth0.18
set interfaces bridge br0 member interface eth0.19
set interfaces bridge br0 member interface vxlan0
set interfaces bridge br1 member interface eth1
set interfaces bridge br1 member interface eth1.1
set interfaces bridge br1 member interface eth1.11
set interfaces bridge br1 member interface eth1.12
set interfaces bridge br1 member interface eth1.13
set interfaces bridge br1 member interface eth1.14
set interfaces bridge br1 member interface eth1.15
set interfaces bridge br1 member interface eth1.16
set interfaces bridge br1 member interface eth1.17
set interfaces bridge br1 member interface eth1.18
set interfaces bridge br1 member interface eth1.19
set interfaces bridge br1 member interface vxlan1
set interfaces bridge br2 member interface eth2
set interfaces bridge br2 member interface eth2.1
set interfaces bridge br2 member interface eth2.11
set interfaces bridge br2 member interface eth2.12
set interfaces bridge br2 member interface eth2.13
set interfaces bridge br2 member interface eth2.14
set interfaces bridge br2 member interface eth2.15
set interfaces bridge br2 member interface eth2.16
set interfaces bridge br2 member interface eth2.17
set interfaces bridge br2 member interface eth2.18
set interfaces bridge br2 member interface eth2.19
set interfaces bridge br2 member interface vxlan2
set interfaces bridge br3 member interface eth3
set interfaces bridge br3 member interface eth3.1
set interfaces bridge br3 member interface eth3.11
set interfaces bridge br3 member interface eth3.12
set interfaces bridge br3 member interface eth3.13
set interfaces bridge br3 member interface eth3.14
set interfaces bridge br3 member interface eth3.15
set interfaces bridge br3 member interface eth3.16
set interfaces bridge br3 member interface eth3.17
set interfaces bridge br3 member interface eth3.18
set interfaces bridge br3 member interface eth3.19
set interfaces bridge br3 member interface vxlan3
set interfaces bridge br4 member interface eth4
set interfaces bridge br4 member interface eth4.1
set interfaces bridge br4 member interface eth4.11
set interfaces bridge br4 member interface eth4.12
set interfaces bridge br4 member interface eth4.13
set interfaces bridge br4 member interface eth4.14
set interfaces bridge br4 member interface eth4.15
set interfaces bridge br4 member interface eth4.16
set interfaces bridge br4 member interface eth4.17
set interfaces bridge br4 member interface eth4.18
set interfaces bridge br4 member interface eth4.19
set interfaces bridge br4 member interface vxlan4
set interfaces bridge br5 member interface eth5
set interfaces bridge br5 member interface eth5.1
set interfaces bridge br5 member interface eth5.11
set interfaces bridge br5 member interface eth5.12
set interfaces bridge br5 member interface eth5.13
set interfaces bridge br5 member interface eth5.14
set interfaces bridge br5 member interface eth5.15
set interfaces bridge br5 member interface eth5.16
set interfaces bridge br5 member interface eth5.17
set interfaces bridge br5 member interface eth5.18
set interfaces bridge br5 member interface eth5.19
set interfaces bridge br5 member interface vxlan5
set interfaces bridge br6 member interface eth6
set interfaces bridge br6 member interface eth6.1
set interfaces bridge br6 member interface eth6.11
set interfaces bridge br6 member interface eth6.12
set interfaces bridge br6 member interface eth6.13
set interfaces bridge br6 member interface eth6.14
set interfaces bridge br6 member interface eth6.15
set interfaces bridge br6 member interface eth6.16
set interfaces bridge br6 member interface eth6.17
set interfaces bridge br6 member interface eth6.18
set interfaces bridge br6 member interface eth6.19
set interfaces bridge br6 member interface vxlan6
set interfaces bridge br7 member interface eth7
set interfaces bridge br7 member interface eth7.1
set interfaces bridge br7 member interface eth7.11
set interfaces bridge br7 member interface eth7.12
set interfaces bridge br7 member interface eth7.13
set interfaces bridge br7 member interface eth7.14
set interfaces bridge br7 member interface eth7.15
set interfaces bridge br7 member interface eth7.16
set interfaces bridge br7 member interface eth7.17
set interfaces bridge br7 member interface eth7.18
set interfaces bridge br7 member interface eth7.19
set interfaces bridge br7 member interface vxlan7
set interfaces bridge br8 member interface eth8
set interfaces bridge br8 member interface eth8.1
set interfaces bridge br8 member interface eth8.11
set interfaces bridge br8 member interface eth8.12
set interfaces bridge br8 member interface eth8.13
set interfaces bridge br8 member interface eth8.14
set interfaces bridge br8 member interface eth8.15
set interfaces bridge br8 member interface eth8.16
set interfaces bridge br8 member interface eth8.17
set interfaces bridge br8 member interface eth8.18
set interfaces bridge br8 member interface eth8.19
set interfaces bridge br8 member interface vxlan8
set interfaces bridge br9 member interface eth9
set interfaces bridge br9 member interface eth9.1
set interfaces bridge br9 member interface eth9.11
set interfaces bridge br9 member interface eth9.12
set interfaces bridge br9 member interface eth9.13
set interfaces bridge br9 member interface eth9.14
set interfaces bridge br9 member interface eth9.15
set interfaces bridge br9 member interface eth9.16
set interfaces bridge br9 member interface eth9.17
set interfaces bridge br9 member interface eth9.18
set interfaces bridge br9 member interface eth9.19
set interfaces bridge br9 member interface vxlan9
set interfaces bridge br10 member interface eth10
set interfaces bridge br10 member interface eth10.1
set interfaces bridge br10 member interface eth10.11
set interfaces bridge br10 member interface eth10.12
set interfaces bridge br10 member interface eth10.13
set interfaces bridge br10 member interface eth10.14
set interfaces bridge br10 member interface eth10.15
set interfaces bridge br10 member interface eth10.16
set interfaces bridge br10 member interface eth10.17
set interfaces bridge br10 member interface eth10.18
set interfaces bridge br10 member interface eth10.19
set interfaces bridge br10 member interface vxlan10
set interfaces ethernet eth19 address '192.0.2.129/31'
set interfaces ethernet eth20 address '192.0.2.133/31'
set interfaces ethernet eth21 address '192.0.2.34/31'
set interfaces ethernet eth24 address 'dhcp'
set interfaces ethernet eth24 description 'management'
set interfaces ethernet eth24 vrf 'management'
set interfaces loopback lo address '192.0.2.3/32'
set interfaces vxlan vxlan0 mtu '16000'
set interfaces vxlan vxlan0 source-address '192.0.2.3'
set interfaces vxlan vxlan0 vni '0'
set interfaces vxlan vxlan1 mtu '16000'
set interfaces vxlan vxlan1 source-address '192.0.2.3'
set interfaces vxlan vxlan1 vni '1'
set interfaces vxlan vxlan2 mtu '16000'
set interfaces vxlan vxlan2 source-address '192.0.2.3'
set interfaces vxlan vxlan2 vni '2'
set interfaces vxlan vxlan3 mtu '16000'
set interfaces vxlan vxlan3 source-address '192.0.2.3'
set interfaces vxlan vxlan3 vni '3'
set interfaces vxlan vxlan4 mtu '16000'
set interfaces vxlan vxlan4 source-address '192.0.2.3'
set interfaces vxlan vxlan4 vni '4'
set interfaces vxlan vxlan5 mtu '16000'
set interfaces vxlan vxlan5 source-address '192.0.2.3'
set interfaces vxlan vxlan5 vni '5'
set interfaces vxlan vxlan6 mtu '16000'
set interfaces vxlan vxlan6 source-address '192.0.2.3'
set interfaces vxlan vxlan6 vni '6'
set interfaces vxlan vxlan7 mtu '16000'
set interfaces vxlan vxlan7 source-address '192.0.2.3'
set interfaces vxlan vxlan7 vni '7'
set interfaces vxlan vxlan8 mtu '16000'
set interfaces vxlan vxlan8 source-address '192.0.2.3'
set interfaces vxlan vxlan8 vni '8'
set interfaces vxlan vxlan9 mtu '16000'
set interfaces vxlan vxlan9 source-address '192.0.2.3'
set interfaces vxlan vxlan9 vni '9'
set interfaces vxlan vxlan10 mtu '16000'
set interfaces vxlan vxlan10 source-address '192.0.2.3'
set interfaces vxlan vxlan10 vni '10'
set protocols bgp address-family ipv4-unicast redistribute connected
set protocols bgp address-family l2vpn-evpn advertise-all-vni
set protocols bgp neighbor 192.0.2.35 address-family ipv4-unicast
set protocols bgp neighbor 192.0.2.35 address-family l2vpn-evpn
set protocols bgp neighbor 192.0.2.35 remote-as '64511'
set protocols bgp neighbor 192.0.2.128 peer-group 'backbone_EVPN_VXLAN'
set protocols bgp neighbor 192.0.2.128 remote-as '64510'
set protocols bgp neighbor 192.0.2.132 peer-group 'backbone_EVPN_VXLAN'
set protocols bgp neighbor 192.0.2.132 remote-as '64510'
set protocols bgp parameters router-id '192.0.2.3'
set protocols bgp peer-group backbone_EVPN_VXLAN address-family ipv4-unicast
set protocols bgp peer-group backbone_EVPN_VXLAN address-family l2vpn-evpn
set protocols bgp system-as '64511'
set service ntp allow-client address '0.0.0.0/0'
set service ntp allow-client address '::/0'
set service ntp server time1.vyos.net
set service ntp server time2.vyos.net
set service ntp server time3.vyos.net
set service ssh vrf 'management'
set system config-management commit-revisions '100'
set system conntrack modules ftp
set system conntrack modules h323
set system conntrack modules nfs
set system conntrack modules pptp
set system conntrack modules sip
set system conntrack modules sqlnet
set system conntrack modules tftp
set system console device ttyS0 speed '115200'
set system syslog global facility all level 'info'
set system syslog global facility protocols level 'debug'
set vrf name management table '100'
